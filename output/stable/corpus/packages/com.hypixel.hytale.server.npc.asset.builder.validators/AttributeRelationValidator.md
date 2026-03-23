# AttributeRelationValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class AttributeRelationValidator extends Validator

Validates a numeric relation between two attributes (e.g. min less than max).

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator, ExistsIfParameterSetValidator (and 33 more)

Complete API:
  public static AttributeRelationValidator withAttributes(String firstAttribute, RelationalOperator relation, String secondAttribute)

Fields:
private final String firstAttribute
private final RelationalOperator relation
private final String secondAttribute
