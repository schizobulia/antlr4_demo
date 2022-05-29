package xml;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Xml {
    public static void main(String[] args) {
        String input = "<demo>123</demo>";
        XMLLexer xmlLexer = new XMLLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(xmlLexer);
        XMLParser xmlParser = new XMLParser(tokenStream);
        xmlParser.addParseListener(new XMLParserListener() {
            @Override
            public void enterDocument(XMLParser.DocumentContext ctx) {
            }

            @Override
            public void exitDocument(XMLParser.DocumentContext ctx) {
            }

            @Override
            public void enterProlog(XMLParser.PrologContext ctx) {
            }

            @Override
            public void exitProlog(XMLParser.PrologContext ctx) {
            }

            @Override
            public void enterContent(XMLParser.ContentContext ctx) {
            }

            @Override
            public void exitContent(XMLParser.ContentContext ctx) {
            }

            @Override
            public void enterElement(XMLParser.ElementContext ctx) {
            }

            @Override
            public void exitElement(XMLParser.ElementContext ctx) {
                System.out.println(ctx.content().getText());
                System.out.println(ctx.Name().get(0).getText());
            }

            @Override
            public void enterReference(XMLParser.ReferenceContext ctx) {

            }

            @Override
            public void exitReference(XMLParser.ReferenceContext ctx) {

            }

            @Override
            public void enterAttribute(XMLParser.AttributeContext ctx) {

            }

            @Override
            public void exitAttribute(XMLParser.AttributeContext ctx) {

            }

            @Override
            public void enterChardata(XMLParser.ChardataContext ctx) {

            }

            @Override
            public void exitChardata(XMLParser.ChardataContext ctx) {

            }

            @Override
            public void enterMisc(XMLParser.MiscContext ctx) {
            }

            @Override
            public void exitMisc(XMLParser.MiscContext ctx) {

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
        xmlParser.document();
    }
}
