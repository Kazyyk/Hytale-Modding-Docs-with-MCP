# StateStringValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class StateStringValidator extends Validator

Validates NPC state string format and references.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public boolean test(String value)
  public String errorMessage(String value)
  public String errorMessage(String value, String name)
  public boolean hasMainState()
  public boolean hasSubState()
  public String getMainState()
  public String getSubState()
  public static StateStringValidator get()
  public static StateStringValidator mainStateOnly()
  public static StateStringValidator requireMainState()
  public static StateStringValidator requireMainStateOrNull()

Fields:
private String[] stateParts
private final boolean allowEmptyMain
private final boolean mainStateOnly
private final boolean allowNull
