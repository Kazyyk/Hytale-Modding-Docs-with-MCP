# TemporalArrayValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: ArrayValidator

public class TemporalArrayValidator extends ArrayValidator

Validates temporal (time-based) array attributes.

Known subclasses: TemporalSequenceValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public abstract boolean test(TemporalAmount[] var1)
  public abstract String errorMessage(String var1, TemporalAmount[] var2)
