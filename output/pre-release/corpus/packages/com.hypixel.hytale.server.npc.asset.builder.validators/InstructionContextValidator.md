# InstructionContextValidator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators | Extends: Validator

public class InstructionContextValidator extends Validator

Validates attributes in the context of NPC instruction evaluation.

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)

Complete API:
  public static String getErrorMessage(String value, InstructionType instructionContext, boolean instructionMatched, ComponentContext componentContext, boolean extraMatched, String breadcrumbs)
  public static InstructionContextValidator inInstructions(EnumSet<InstructionType> instructionTypes, EnumSet<ComponentContext> componentContexts)

Fields:
private final EnumSet<InstructionType> instructionTypes
private final EnumSet<ComponentContext> componentContexts
