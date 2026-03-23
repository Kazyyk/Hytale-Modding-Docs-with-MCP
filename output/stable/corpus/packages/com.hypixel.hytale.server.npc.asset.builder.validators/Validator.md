# Validator

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder.validators

public abstract class Validator

Abstract base class for all NPC asset builder validators. Validators check NPC configuration data at load time to ensure correctness. Concrete implementations are registered in ValidatorTypeRegistry with JSON type discriminator names.

Known subclasses: AnyBooleanValidator, AnyPresentValidator, ArrayValidator, ArraysOneSetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, DoubleArrayValidator, DoubleValidator, EnumArrayValidator, ExistsIfParameterSetValidator, InstructionContextValidator, IntArrayValidator, IntValidator, NoDuplicatesValidator, OneOrNonePresentValidator, OnePresentValidator, RequiredFeatureValidator, StringArrayValidator, StringValidator, StringsAtMostOneValidator, StringsNotEmptyValidator, StringsOneSetValidator, TemporalArrayValidator, ValidateAssetIfEnumIsValidator, ValidateIfEnumIsValidator

Known implementors: ArraySizeRangeValidator, ArraySizeValidator, ArrayValidator, AssetKeyValidator, ChannelValidator, ChannelValidator, CommonAssetValidator, CosmeticAssetValidator, DoubleArraySizeValidator, DoubleArrayValidator, EqualValidator, FloatArrayValidator, InstanceValidator, IntArraySizeValidator, IntArrayValidator, IntRangeBoundValidator, LateValidator, LegacyValidator, LoopValidator, MapKeyValidator, MapValidator, MapValueValidator, NonEmptyDoubleArrayValidator, NonEmptyFloatArrayValidator, NonEmptyStringValidator, NonNullValidator, NotEqualValidator, OrValidator, RangeRefValidator, RangeValidator, RequiredMapKeysValidator, SequentialDoubleArrayValidator, UniqueInArrayValidator

Also in this package: AnyBooleanValidator, AnyPresentValidator, ArrayNotEmptyValidator, ArrayValidator, ArraysOneSetValidator, AssetValidator, AtMostOneBooleanValidator, AttributeRelationValidator, BooleanArrayValidator, BooleanImplicationValidator, ComponentOnlyValidator, Config, DoubleArrayValidator, DoubleOrValidator, DoubleRangeValidator, DoubleSequenceValidator, DoubleSingleValidator, DoubleValidator, EnumArrayNoDuplicatesValidator, EnumArrayValidator (and 33 more)
