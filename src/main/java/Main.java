import demo.HelloListener;
import demo.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import demo.HelloLexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {
    public static void main(String[] args) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString("hello parrt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        parser.addParseListener(new HelloListener() {
            @Override
            public void enterR(HelloParser.RContext ctx) {
                System.out.println("===enterR===");
            }

            @Override
            public void exitR(HelloParser.RContext ctx) {
                System.out.println("===exitR===");
            }

            @Override
            public void visitTerminal(TerminalNode terminalNode) {
                System.out.println("===visitTerminal===");
            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {
                System.out.println("===visitErrorNode===");
            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println("===enterEveryRule===");
            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {
                System.out.println("===exitEveryRule===");
            }
        });
        System.out.println(parser.r().toStringTree(parser));
    }
}
