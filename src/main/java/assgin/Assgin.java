package assgin;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Assgin {
    public static void main(String[] args) {
        AssginLexer lexer = new AssginLexer(CharStreams.fromString("b=1+2;"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AssginParser parser = new AssginParser(tokenStream);
        AssginParser.AssignContext context = parser.assign();
        System.out.println(context.ID());
        for (AssginParser.ExprContext expr: context.expr()) {
            System.out.println(expr.getText());
        }
    }
}
