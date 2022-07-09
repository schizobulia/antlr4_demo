package css;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;

public class Css {
    public static void main(String[] args) {
        CssLexer lexer = new CssLexer(CharStreams.fromString(".b { color: red; } .c { color: blue; }"));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        CssParser parser = new CssParser(stream);
        ParseTree tree = parser.stylesheet();
        EvalVisitor evalVisitor = new EvalVisitor(stream);
        evalVisitor.visit(tree);
        System.out.println(evalVisitor.rewriter.getText());
    }
}

class EvalVisitor extends CssBaseVisitor<String> {
    TokenStreamRewriter rewriter;
    public EvalVisitor(CommonTokenStream tokenStream) {
        rewriter = new TokenStreamRewriter(tokenStream);
    }

    @Override
    public String visitExpr(CssParser.ExprContext ctx) {
        String text = ctx.getText();
        if (text.equals("red")) {
            rewriter.replace(ctx.getStart(), ctx.getStop(), "#ff0000");
        }
        return super.visitExpr(ctx);
    }
}
