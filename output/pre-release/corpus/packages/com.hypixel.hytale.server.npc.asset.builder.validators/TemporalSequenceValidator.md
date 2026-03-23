# TemporalSequenceValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class TemporalSequenceValidator extends Validator

Validates that a temporal sequence is monotonically ordered.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static TemporalSequenceValidator betweenMonotonic(TemporalAmount lower, TemporalAmount upper)
  public static TemporalSequenceValidator betweenWeaklyMonotonic(TemporalAmount lower, TemporalAmount upper)
  public static boolean compare(LocalDateTime value, RelationalOperator op, LocalDateTime c)
  public boolean test(TemporalAmount[] values)
  public String errorMessage(String name, TemporalAmount[] value)

Fields:
private final RelationalOperator relationLower
private final TemporalAmount lower
private final RelationalOperator relationUpper
private final TemporalAmount upper
private final RelationalOperator relationSequence
