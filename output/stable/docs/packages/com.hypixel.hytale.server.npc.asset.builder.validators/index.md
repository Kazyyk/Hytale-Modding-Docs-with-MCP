---
title: "com.hypixel.hytale.server.npc.asset.builder.validators"
kind: "package"
package: "com.hypixel.hytale.server.npc.asset.builder.validators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "validator"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.validators`

NPC asset builder validation system. Provides a polymorphic set of validators for checking NPC configuration data at load time. Each validator subtype handles a specific data type or constraint pattern (string emptiness, numeric ranges, array contents, enum constraints, feature requirements, etc.). Validators are registered via [ValidatorTypeRegistry](ValidatorTypeRegistry.md) using Gson's `SubTypeTypeAdapterFactory` for JSON polymorphic deserialization.

## Types

| Type | Kind | Description |
|---|---|---|
| [Validator](Validator.md) | class | Abstract base class for all validators. |
| [ValidatorTypeRegistry](ValidatorTypeRegistry.md) | class | Registers all validator subtypes with Gson. |
| [SubTypeTypeAdapterFactory](SubTypeTypeAdapterFactory.md) | class | Gson TypeAdapterFactory for polymorphic validator deserialization. |
| [RelationalOperator](RelationalOperator.md) | enum | Relational operators for numeric attribute comparison. |
| [AssetValidator](AssetValidator.md) | class | Validates NPC asset configurations. |
| [StringValidator](StringValidator.md) | class | Base class for string validators. |
| [StringNotEmptyValidator](StringNotEmptyValidator.md) | class | String must not be empty. |
| [StringNullOrNotEmptyValidator](StringNullOrNotEmptyValidator.md) | class | String must be null or non-empty. |
| [StringsAtMostOneValidator](StringsAtMostOneValidator.md) | class | At most one string attribute set. |
| [StringsOneSetValidator](StringsOneSetValidator.md) | class | Exactly one string attribute set. |
| [StringsNotEmptyValidator](StringsNotEmptyValidator.md) | class | No specified strings empty. |
| [IntValidator](IntValidator.md) | class | Base class for integer validators. |
| [IntSingleValidator](IntSingleValidator.md) | class | Single integer constraint. |
| [IntOrValidator](IntOrValidator.md) | class | Integer equals one of allowed values. |
| [IntRangeValidator](IntRangeValidator.md) | class | Integer within range. |
| [IntSequenceValidator](IntSequenceValidator.md) | class | Integer sequence ordering. |
| [DoubleValidator](DoubleValidator.md) | class | Base class for double validators. |
| [DoubleSingleValidator](DoubleSingleValidator.md) | class | Single double constraint. |
| [DoubleOrValidator](DoubleOrValidator.md) | class | Double equals one of allowed values. |
| [DoubleRangeValidator](DoubleRangeValidator.md) | class | Double within range. |
| [DoubleSequenceValidator](DoubleSequenceValidator.md) | class | Double sequence ordering. |
| [ArrayValidator](ArrayValidator.md) | class | Base class for array validators. |
| [ArrayNotEmptyValidator](ArrayNotEmptyValidator.md) | class | Array must not be empty. |
| [ArraysOneSetValidator](ArraysOneSetValidator.md) | class | Exactly one of multiple arrays set. |
| [IntArrayValidator](IntArrayValidator.md) | class | Integer array validation. |
| [DoubleArrayValidator](DoubleArrayValidator.md) | class | Double array validation. |
| [BooleanArrayValidator](BooleanArrayValidator.md) | class | Boolean array validation. |
| [EnumArrayValidator](EnumArrayValidator.md) | class | Enum array validation. |
| [EnumArrayNoDuplicatesValidator](EnumArrayNoDuplicatesValidator.md) | class | Enum array with no duplicates. |
| [StringArrayValidator](StringArrayValidator.md) | class | String array validation. |
| [StringArrayNotEmptyValidator](StringArrayNotEmptyValidator.md) | class | String array must not be empty. |
| [StringArrayNoEmptyStringsValidator](StringArrayNoEmptyStringsValidator.md) | class | String array contains no empty strings. |
| [TemporalArrayValidator](TemporalArrayValidator.md) | class | Temporal array validation. |
| [TemporalSequenceValidator](TemporalSequenceValidator.md) | class | Temporal sequence ordering. |
| [AnyPresentValidator](AnyPresentValidator.md) | class | At least one attribute present. |
| [OnePresentValidator](OnePresentValidator.md) | class | Exactly one attribute present. |
| [OneOrNonePresentValidator](OneOrNonePresentValidator.md) | class | At most one attribute present. |
| [AnyBooleanValidator](AnyBooleanValidator.md) | class | At least one boolean true. |
| [AtMostOneBooleanValidator](AtMostOneBooleanValidator.md) | class | At most one boolean true. |
| [BooleanImplicationValidator](BooleanImplicationValidator.md) | class | Boolean implication (if A then B). |
| [AttributeRelationValidator](AttributeRelationValidator.md) | class | Numeric relation between attributes. |
| [NoDuplicatesValidator](NoDuplicatesValidator.md) | class | No duplicate entries. |
| [ComponentOnlyValidator](ComponentOnlyValidator.md) | class | Attribute valid only in component context. |
| [ExistsIfParameterSetValidator](ExistsIfParameterSetValidator.md) | class | Attribute exists only if parameter set. |
| [InstructionContextValidator](InstructionContextValidator.md) | class | Instruction context validation. |
| [RequiredFeatureValidator](RequiredFeatureValidator.md) | class | Required NPC feature validation. |
| [RequiresFeatureIfValidator](RequiresFeatureIfValidator.md) | class | Feature required when condition set. |
| [RequiresFeatureIfEnumValidator](RequiresFeatureIfEnumValidator.md) | class | Feature required for specific enum value. |
| [RequiresOneOfFeaturesValidator](RequiresOneOfFeaturesValidator.md) | class | At least one feature required. |
| [StateStringValidator](StateStringValidator.md) | class | State string format validation. |
| [TagSetExistsValidator](TagSetExistsValidator.md) | class | Tag set existence validation. |
| [ValidateIfEnumIsValidator](ValidateIfEnumIsValidator.md) | class | Conditional validation on enum value. |
| [ValidateAssetIfEnumIsValidator](ValidateAssetIfEnumIsValidator.md) | class | Conditional asset validation on enum value. |
