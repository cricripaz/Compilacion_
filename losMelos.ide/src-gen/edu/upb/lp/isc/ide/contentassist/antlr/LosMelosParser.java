/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.upb.lp.isc.ide.contentassist.antlr.internal.InternalLosMelosParser;
import edu.upb.lp.isc.services.LosMelosGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LosMelosParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LosMelosGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LosMelosGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDefinicionesAccess().getAlternatives(), "rule__Definiciones__Alternatives");
			builder.put(grammarAccess.getExpresionAccess().getAlternatives(), "rule__Expresion__Alternatives");
			builder.put(grammarAccess.getExpresionVarAccess().getAlternatives(), "rule__ExpresionVar__Alternatives");
			builder.put(grammarAccess.getBasicaAccess().getAlternatives(), "rule__Basica__Alternatives");
			builder.put(grammarAccess.getExprNumberAccess().getAlternatives(), "rule__ExprNumber__Alternatives");
			builder.put(grammarAccess.getExprArithmeticAccess().getSimboloAlternatives_1_0(), "rule__ExprArithmetic__SimboloAlternatives_1_0");
			builder.put(grammarAccess.getExprArithmeticAccess().getVal1Alternatives_2_0(), "rule__ExprArithmetic__Val1Alternatives_2_0");
			builder.put(grammarAccess.getExprArithmeticAccess().getVal2Alternatives_3_0(), "rule__ExprArithmetic__Val2Alternatives_3_0");
			builder.put(grammarAccess.getExprBoolAccess().getAlternatives(), "rule__ExprBool__Alternatives");
			builder.put(grammarAccess.getValBoolAccess().getVarAlternatives_0(), "rule__ValBool__VarAlternatives_0");
			builder.put(grammarAccess.getCompBoolAccess().getVarAlternatives_1_0(), "rule__CompBool__VarAlternatives_1_0");
			builder.put(grammarAccess.getCompBoolAccess().getVal3Alternatives_2_0(), "rule__CompBool__Val3Alternatives_2_0");
			builder.put(grammarAccess.getCompBoolAccess().getVal4Alternatives_3_0(), "rule__CompBool__Val4Alternatives_3_0");
			builder.put(grammarAccess.getOpBoolAccess().getVarAlternatives_1_0(), "rule__OpBool__VarAlternatives_1_0");
			builder.put(grammarAccess.getExprIfAccess().getConditionAlternatives_2_0(), "rule__ExprIf__ConditionAlternatives_2_0");
			builder.put(grammarAccess.getElementListAccess().getAlternatives(), "rule__ElementList__Alternatives");
			builder.put(grammarAccess.getFuncListAccess().getAlternatives(), "rule__FuncList__Alternatives");
			builder.put(grammarAccess.getExprCarAccess().getListAlternatives_2_0(), "rule__ExprCar__ListAlternatives_2_0");
			builder.put(grammarAccess.getExprCdrAccess().getListAlternatives_2_0(), "rule__ExprCdr__ListAlternatives_2_0");
			builder.put(grammarAccess.getExprIsEmptyAccess().getListAlternatives_2_0(), "rule__ExprIsEmpty__ListAlternatives_2_0");
			builder.put(grammarAccess.getExprLengthAccess().getListAlternatives_2_0(), "rule__ExprLength__ListAlternatives_2_0");
			builder.put(grammarAccess.getEjecucionesAccess().getAlternatives(), "rule__Ejecuciones__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getFuncionesAccess().getGroup(), "rule__Funciones__Group__0");
			builder.put(grammarAccess.getVariablesAccess().getGroup(), "rule__Variables__Group__0");
			builder.put(grammarAccess.getExprArithmeticAccess().getGroup(), "rule__ExprArithmetic__Group__0");
			builder.put(grammarAccess.getLlamadaFuncionAccess().getGroup(), "rule__LlamadaFuncion__Group__0");
			builder.put(grammarAccess.getCompBoolAccess().getGroup(), "rule__CompBool__Group__0");
			builder.put(grammarAccess.getOpBoolAccess().getGroup(), "rule__OpBool__Group__0");
			builder.put(grammarAccess.getExprIfAccess().getGroup(), "rule__ExprIf__Group__0");
			builder.put(grammarAccess.getExprListAccess().getGroup(), "rule__ExprList__Group__0");
			builder.put(grammarAccess.getExprList2Access().getGroup(), "rule__ExprList2__Group__0");
			builder.put(grammarAccess.getExprCarAccess().getGroup(), "rule__ExprCar__Group__0");
			builder.put(grammarAccess.getExprCdrAccess().getGroup(), "rule__ExprCdr__Group__0");
			builder.put(grammarAccess.getExprConsAccess().getGroup(), "rule__ExprCons__Group__0");
			builder.put(grammarAccess.getExprIsEmptyAccess().getGroup(), "rule__ExprIsEmpty__Group__0");
			builder.put(grammarAccess.getExprLengthAccess().getGroup(), "rule__ExprLength__Group__0");
			builder.put(grammarAccess.getExprPrintAccess().getGroup(), "rule__ExprPrint__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_2(), "rule__Program__NameAssignment_2");
			builder.put(grammarAccess.getProgramAccess().getSeccionDefinicionesAssignment_3(), "rule__Program__SeccionDefinicionesAssignment_3");
			builder.put(grammarAccess.getProgramAccess().getSeccionEjecucionesAssignment_6(), "rule__Program__SeccionEjecucionesAssignment_6");
			builder.put(grammarAccess.getFuncionesAccess().getNameAssignment_3(), "rule__Funciones__NameAssignment_3");
			builder.put(grammarAccess.getFuncionesAccess().getParamAssignment_4(), "rule__Funciones__ParamAssignment_4");
			builder.put(grammarAccess.getFuncionesAccess().getBodyAssignment_6(), "rule__Funciones__BodyAssignment_6");
			builder.put(grammarAccess.getVariablesAccess().getNameAssignment_2(), "rule__Variables__NameAssignment_2");
			builder.put(grammarAccess.getVariablesAccess().getBodyAssignment_3(), "rule__Variables__BodyAssignment_3");
			builder.put(grammarAccess.getLlamadaParametroAccess().getParamAssignment(), "rule__LlamadaParametro__ParamAssignment");
			builder.put(grammarAccess.getExprStringAccess().getValAssignment(), "rule__ExprString__ValAssignment");
			builder.put(grammarAccess.getExprIntAccess().getVarAssignment(), "rule__ExprInt__VarAssignment");
			builder.put(grammarAccess.getExprArithmeticAccess().getSimboloAssignment_1(), "rule__ExprArithmetic__SimboloAssignment_1");
			builder.put(grammarAccess.getExprArithmeticAccess().getVal1Assignment_2(), "rule__ExprArithmetic__Val1Assignment_2");
			builder.put(grammarAccess.getExprArithmeticAccess().getVal2Assignment_3(), "rule__ExprArithmetic__Val2Assignment_3");
			builder.put(grammarAccess.getExprParamAccess().getNameAssignment(), "rule__ExprParam__NameAssignment");
			builder.put(grammarAccess.getLlamadaFuncionAccess().getNamefuncionAssignment_1(), "rule__LlamadaFuncion__NamefuncionAssignment_1");
			builder.put(grammarAccess.getLlamadaFuncionAccess().getParamAssignment_2(), "rule__LlamadaFuncion__ParamAssignment_2");
			builder.put(grammarAccess.getValBoolAccess().getVarAssignment(), "rule__ValBool__VarAssignment");
			builder.put(grammarAccess.getCompBoolAccess().getVarAssignment_1(), "rule__CompBool__VarAssignment_1");
			builder.put(grammarAccess.getCompBoolAccess().getVal3Assignment_2(), "rule__CompBool__Val3Assignment_2");
			builder.put(grammarAccess.getCompBoolAccess().getVal4Assignment_3(), "rule__CompBool__Val4Assignment_3");
			builder.put(grammarAccess.getOpBoolAccess().getVarAssignment_1(), "rule__OpBool__VarAssignment_1");
			builder.put(grammarAccess.getOpBoolAccess().getOp1Assignment_2(), "rule__OpBool__Op1Assignment_2");
			builder.put(grammarAccess.getOpBoolAccess().getOp2Assignment_3(), "rule__OpBool__Op2Assignment_3");
			builder.put(grammarAccess.getExprIfAccess().getConditionAssignment_2(), "rule__ExprIf__ConditionAssignment_2");
			builder.put(grammarAccess.getExprIfAccess().getThenAssignment_3(), "rule__ExprIf__ThenAssignment_3");
			builder.put(grammarAccess.getExprIfAccess().getElseAssignment_4(), "rule__ExprIf__ElseAssignment_4");
			builder.put(grammarAccess.getExprListAccess().getListaAssignment_3(), "rule__ExprList__ListaAssignment_3");
			builder.put(grammarAccess.getExprList2Access().getListaAssignment_3(), "rule__ExprList2__ListaAssignment_3");
			builder.put(grammarAccess.getExprCarAccess().getListAssignment_2(), "rule__ExprCar__ListAssignment_2");
			builder.put(grammarAccess.getExprCdrAccess().getListAssignment_2(), "rule__ExprCdr__ListAssignment_2");
			builder.put(grammarAccess.getExprConsAccess().getL1Assignment_2(), "rule__ExprCons__L1Assignment_2");
			builder.put(grammarAccess.getExprConsAccess().getL2Assignment_3(), "rule__ExprCons__L2Assignment_3");
			builder.put(grammarAccess.getExprIsEmptyAccess().getListAssignment_2(), "rule__ExprIsEmpty__ListAssignment_2");
			builder.put(grammarAccess.getExprLengthAccess().getListAssignment_2(), "rule__ExprLength__ListAssignment_2");
			builder.put(grammarAccess.getExprPrintAccess().getVarAssignment_2(), "rule__ExprPrint__VarAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LosMelosGrammarAccess grammarAccess;

	@Override
	protected InternalLosMelosParser createParser() {
		InternalLosMelosParser result = new InternalLosMelosParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LosMelosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LosMelosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}