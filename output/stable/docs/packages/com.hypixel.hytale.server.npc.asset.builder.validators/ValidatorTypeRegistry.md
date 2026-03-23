---
title: "ValidatorTypeRegistry"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.ValidatorTypeRegistry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "validator"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.validators`

```java
public class ValidatorTypeRegistry
```

Registers all NPC asset builder validator subtypes with Gson via a `SubTypeTypeAdapterFactory`. The `registerTypes` method adds all known validators with their JSON type discriminator names: `StringNotEmpty`, `StringNullOrNotEmpty`, `StringsAtMostOne`, `StringsOneSet`, `NotAllStringsEmpty`, `Int`, `IntOr`, `IntRange`, `Double`, `DoubleOr`, `DoubleRange`, `NumericRelation`, `ArrayNotEmpty`, `AnyPresent`, `OnePresent`, `OneOrNonePresent`, `AnyTrue`, `StringListNotEmpty`, `StringListNoEmptyStrings`, `DoubleSequenceValidator`, `IntSequenceValidator`, `ExistsIfParameterSet`, `TemporalSequenceValidator`, `RequiresFeatureIf`, `RequiresOneOfFeatures`, `StateString`, `ValidateIfEnumIs`, `ValidateAssetIfEnumIs`, `ComponentOnly`, `RequiresFeatureIfEnum`, `EnumArrayNoDuplicates`, `ArraysOneSet`, `BooleanImplication`, `InstructionContext`, `AtMostOneBoolean`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `GsonBuilder` | `registerTypes(@Nonnull GsonBuilder gsonBuilder)` |
