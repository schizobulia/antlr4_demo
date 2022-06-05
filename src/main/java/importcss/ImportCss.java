package importcss;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ImportCss {
    public static void main(String[] args) {
        String input = "/** @Import(\"asd\"); **/ @import(\"12323\");";
        ImportCssLexer lexer = new ImportCssLexer(CharStreams.fromString(input));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        ImportCssParser parser = new ImportCssParser(stream);
        ParseTree tree = parser.assign();
        new EvalVisitor().visit(tree);
    }
}

class EvalVisitor extends ImportCssBaseVisitor<String> {
    @Override
    public String visitAssign(ImportCssParser.AssignContext ctx) {
        System.out.println(ctx.CONTENT());
        return super.visitAssign(ctx);
    }
}

