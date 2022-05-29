package expr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Expr {
    public static void main(String[] args) {
        String input = "a = 5 + 1 \n b = 6 \n c = 1 + 2 + 3 \n";
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(stream);
        parser.addParseListener(new ExprListener() {
            @Override
            public void enterProg(ExprParser.ProgContext ctx) {

            }

            @Override
            public void exitProg(ExprParser.ProgContext ctx) {

            }

            @Override
            public void enterStat(ExprParser.StatContext ctx) {
                System.out.println("开始解析：");
            }

            @Override
            public void exitStat(ExprParser.StatContext ctx) {
                if (ctx.ID() != null) {
                    System.out.println("key: " + ctx.ID().getText());
                }
            }

            @Override
            public void enterExpr(ExprParser.ExprContext ctx) {

            }

            @Override
            public void exitExpr(ExprParser.ExprContext ctx) {
                if (ctx.INT() != null) {
                    System.out.println("数值: " + ctx.INT().getText());
                }
            }

            @Override
            public void visitTerminal(TerminalNode terminalNode) {

            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {

            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {

            }
        });
        ParseTree tree = parser.prog();
        tree.toStringTree(parser);
    }
}
