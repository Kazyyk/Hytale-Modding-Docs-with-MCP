# ValidatorTypeRegistry

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators

public class ValidatorTypeRegistry

Registers all NPC asset builder validator subtypes with Gson via a `SubTypeTypeAdapterFactory`. The `registerTypes` method adds all known validators with their JSON type discriminator names: `StringNotEmpty`, `StringNullOrNotEmpty`, `StringsAtMostOne`, `StringsOneSet`, `NotAllStringsEmpty`, `Int`, `IntOr`, `IntRange`, `Double`, `DoubleOr`, `DoubleRange`, `NumericRelation`, `ArrayNotEmpty`, `AnyPresent`, `OnePresent`, `OneOrNonePresent`, `AnyTrue`, `StringListNotEmpty`, `StringListNoEmptyStrings`, `DoubleSequenceValidator`, `IntSequenceValidator`, `ExistsIfParameterSet`, `TemporalSequenceValidator`, `RequiresFeatureIf`, `RequiresOneOfFeatures`, `StateString`, `ValidateIfEnumIs`, `ValidateAssetIfEnumIs`, `ComponentOnly`, `RequiresFeatureIfEnum`, `EnumArrayNoDuplicates`, `ArraysOneSet`, `BooleanImplication`, `InstructionContext`, `AtMostOneBoolean`.

## Methods

- @Nonnull public static GsonBuilder registerTypes(@Nonnull GsonBuilder gsonBuilder)
