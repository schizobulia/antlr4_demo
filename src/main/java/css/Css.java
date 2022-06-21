package css;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

public class Css {
    public static void main(String[] args) {
        CssLexer lexer = new CssLexer(CharStreams.fromString("@import 'x.css';"));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        CssParser parser = new CssParser(stream);
        ParseTree tree = parser.stylesheet();
        new EvalVisitor().visit(tree);
    }
}

class EvalVisitor extends CssBaseVisitor<String> {
    @Override
    public String visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public String visitGoodImport(CssParser.GoodImportContext ctx) {
        System.out.println(ctx.String_());
        return super.visitGoodImport(ctx);
    }
}
