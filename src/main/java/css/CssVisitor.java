// Generated from Css.g4 by ANTLR 4.9

    package css;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CssVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodCharset}
	 * labeled alternative in {@link CssParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodCharset(CssParser.GoodCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badCharset}
	 * labeled alternative in {@link CssParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadCharset(CssParser.BadCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodImport}
	 * labeled alternative in {@link CssParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodImport(CssParser.GoodImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badImport}
	 * labeled alternative in {@link CssParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadImport(CssParser.BadImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodNamespace}
	 * labeled alternative in {@link CssParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodNamespace(CssParser.GoodNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badNamespace}
	 * labeled alternative in {@link CssParser#namespace_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadNamespace(CssParser.BadNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(CssParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(CssParser.MediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(CssParser.MediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaType(CssParser.MediaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExpression(CssParser.MediaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#mediaFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaFeature(CssParser.MediaFeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(CssParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudoPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoPage(CssParser.PseudoPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(CssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorSequence(CssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(CssParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamespacePrefix(CssParser.TypeNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(CssParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(CssParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CssParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(CssParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(CssParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalPseudo(CssParser.FunctionalPseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CssParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(CssParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#negationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationArg(CssParser.NegationArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link CssParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodOperator(CssParser.GoodOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link CssParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadOperator(CssParser.BadOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link CssParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodProperty(CssParser.GoodPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link CssParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadProperty(CssParser.BadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link CssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownRuleset(CssParser.KnownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link CssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownRuleset(CssParser.UnknownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(CssParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownDeclaration(CssParser.KnownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDeclaration(CssParser.UnknownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrio(CssParser.PrioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CssParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CssParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownTerm(CssParser.KnownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownTerm(CssParser.UnknownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link CssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadTerm(CssParser.BadTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_(CssParser.Function_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#dxImageTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDxImageTransform(CssParser.DxImageTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#hexcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexcolor(CssParser.HexcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CssParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(CssParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(CssParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#unknownDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDimension(CssParser.UnknownDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_(CssParser.Any_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownAtRule(CssParser.UnknownAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#atKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtKeyword(CssParser.AtKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnused(CssParser.UnusedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CssParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(CssParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupRuleBody(CssParser.GroupRuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsRule(CssParser.SupportsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsCondition(CssParser.SupportsConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConditionInParens(CssParser.SupportsConditionInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsNegation(CssParser.SupportsNegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsConjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConjunction(CssParser.SupportsConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDisjunction(CssParser.SupportsDisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDeclarationCondition(CssParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#generalEnclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralEnclosed(CssParser.GeneralEnclosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(CssParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(CssParser.CalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcSum(CssParser.CalcSumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcProduct(CssParser.CalcProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValue(CssParser.CalcValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFaceRule(CssParser.FontFaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link CssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownFontFaceDeclaration(CssParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link CssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownFontFaceDeclaration(CssParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesRule(CssParser.KeyframesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#keyframesBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesBlocks(CssParser.KeyframesBlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#viewport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewport(CssParser.ViewportContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#counterStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCounterStyle(CssParser.CounterStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFeatureValuesRule(CssParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyNameList(CssParser.FontFamilyNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyName(CssParser.FontFamilyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#featureValueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueBlock(CssParser.FeatureValueBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#featureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureType(CssParser.FeatureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueDefinition(CssParser.FeatureValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(CssParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CssParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(CssParser.WsContext ctx);
}