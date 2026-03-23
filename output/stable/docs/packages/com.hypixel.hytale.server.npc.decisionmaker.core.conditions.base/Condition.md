---
title: "Condition"
kind: "class"
package: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base"
fqcn: "com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base.Condition"
api_surface: false
extends: null
implements: ["JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Condition>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "decisionmaker"
  - "core"
---

**Package:** `com.hypixel.hytale.server.npc.decisionmaker.core.conditions.base`

```java
public abstract class Condition implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, Condition>>
```

Abstract base class providing shared logic for Condition implementations.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `NO_TARGET` | `Double.MAX_VALUE` |
| `public static final` | `int` | `ALWAYS_TRUE_SIMPLICITY` | `0` |
| `public static final` | `int` | `BOOLEAN_CHECK_SIMPLICITY` | `10` |
| `public static final` | `int` | `NORMALISED_CURVE_SIMPLICITY` | `20` |
| `public static final` | `int` | `SCALED_CURVE_SIMPLICITY` | `30` |
| `public static final` | `int` | `HIGH_COST_SIMPLICITY` | `40` |
| `@Nonnull public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` | `new ContainedAssetCodec<>(Condition.class, CODEC)` |
| `@Nonnull public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` | `new ArrayCodec<>(CHILD_ASSET_CODEC, String[]::new)` |
| `@Nonnull public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` | `new ValidatorCache<>(new AssetKeyValidator<>(Condition::getAssetStore))` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `AssetStore<String, Condition, IndexedLookupTableAssetMap<String, Condition>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `WeakReference<Condition>` | `reference` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Condition(String id)` |
| `protected` | | `Condition()` |
| `@Nonnull public static` | `AssetStore<String, Condition, IndexedLookupTableAssetMap<String, Condition>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, Condition>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `void` | `setupNPC(Role role)` |
| `public` | `void` | `setupNPC(Holder<EntityStore> holder)` |
| `public` | `WeakReference<Condition>` | `getReference()` |
| `public abstract` | `double` | `calculateUtility(int var1, ArchetypeChunk<EntityStore> var2, Ref<EntityStore> var3, CommandBuffer<EntityStore> var4, EvaluationContext var5)` |
| `public abstract` | `int` | `getSimplicity()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `Condition` | `getAlwaysTrueFor(String id)` |
