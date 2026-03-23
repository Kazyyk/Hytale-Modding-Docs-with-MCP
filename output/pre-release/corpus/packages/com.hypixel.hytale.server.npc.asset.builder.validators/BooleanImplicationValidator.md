# BooleanImplicationValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class BooleanImplicationValidator extends Validator

Validates that if one boolean is true then another must also be true.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public boolean test(boolean[] antecedents, boolean[] consequents)
  private boolean allMatch(boolean[] values, boolean expected)
  private boolean anyMatch(boolean[] values, boolean expected)
  public String errorMessage()
  public static BooleanImplicationValidator withAttributes(String[] antecedentSet, boolean antecedentState, String[] consequentSet, boolean consequentState, boolean anyAntecedent)

Fields:
private final String[] antecedentSet
private final boolean antecedentState
private final String[] consequentSet
private final boolean consequentState
private final boolean anyAntecedent
