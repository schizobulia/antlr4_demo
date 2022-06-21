package xml;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Xml {

    public static void main(String[] args) throws IOException {
        String input = "<?xml version=\"1.0\"?><div id='demo'>123</div>";
        XMLLexer xmlLexer = new XMLLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(xmlLexer);
        XMLParser xmlParser = new XMLParser(tokenStream);
        ParseTree tree = xmlParser.document();
        new EvalVisitor().visit(tree);
    }

}

class EvalVisitor extends XMLParserBaseVisitor<String> {
    @Override
    public String visitElement(XMLParser.ElementContext ctx) {
        System.out.println(ctx.content().getText());
        System.out.println(ctx.Name().get(0));
        ctx.attribute().stream().forEach((item -> {
            System.out.println(item.Name());
            System.out.println(item.STRING());
        }));
        return super.visitElement(ctx);
    }
}