package structure;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Structure {
    public static void main(String[] args) {
       StructureLexer lexer = new StructureLexer(CharStreams.fromString("[5, 1, 3]"));
       CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        StructureParser parser = new StructureParser(tokenStream);
        parser.addParseListener(new StructureListener() {
            @Override
            public void enterInit(StructureParser.InitContext ctx) {
            }

            @Override
            public void exitInit(StructureParser.InitContext ctx) {
            }

            @Override
            public void enterValue(StructureParser.ValueContext ctx) {
            }

            @Override
            public void exitValue(StructureParser.ValueContext ctx) {
                if (ctx.invokingState > -1) {
                    System.out.println(ctx.getText());
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
        parser.value();
    }
}
