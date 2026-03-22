---
title: "BuilderActionAttack"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.combat.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.combat.builders.BuilderActionAttack"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.combat.builders`

```java
public class BuilderActionAttack extends BuilderActionBase
```

NPC behavior action builder for ActionAttack functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `String` | `ATTACK_PARAMETER` | `"Attack"` |
| `public static final` | `String[]` | `ANTECEDENT` | `new String[]{"SkipAiming"}` |
| `public static final` | `String[]` | `SUBSEQUENT` | `new String[]{"LineOfSight", "AvoidFriendlyFire"}` |
| `public static final` | `double[]` | `DEFAULT_ATTACK_PAUSE_RANGE` | `new double[]{0.0, 0.0}` |
| `public static final` | `double[]` | `DEFAULT_AIMING_TIME_RANGE` | `new double[]{0.0, 0.0}` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `AssetHolder` | `attack` | `new AssetHolder()` |
| `protected final` | `EnumHolder<ActionAttack.AttackType>` | `attackType` | `new EnumHolder<>()` |
| `protected final` | `FloatHolder` | `chargeFor` | `new FloatHolder()` |
| `protected final` | `NumberArrayHolder` | `attackPauseRange` | `new NumberArrayHolder()` |
| `protected final` | `NumberArrayHolder` | `aimingTimeRange` | `new NumberArrayHolder()` |
| `protected` | `double` | `meleeConeAngle` |  |
| `protected` | `ActionAttack.BallisticMode` | `ballisticMode` | `ActionAttack.BallisticMode.Short` |
| `protected` | `boolean` | `checkLineOfSight` |  |
| `protected` | `boolean` | `avoidFriendlyFire` |  |
| `protected` | `boolean` | `damageFriendlies` |  |
| `protected` | `boolean` | `skipAiming` |  |
| `protected` | `DoubleHolder` | `chargeDistance` | `new DoubleHolder()` |
| `protected` | `boolean` | `attackProvided` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionAttack` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionAttack` | `readConfig(@Nonnull JsonElement data)` |
| `@Nullable public` | `String` | `getAttack(@Nonnull BuilderSupport builderSupport)` |
| `public` | `ActionAttack.AttackType` | `getAttackType(@Nonnull BuilderSupport support)` |
| `public` | `float` | `getChargeTime(@Nonnull BuilderSupport support)` |
| `public` | `double[]` | `getAttackPauseRange(@Nonnull BuilderSupport support)` |
| `public` | `double[]` | `getAimingTimeRange(@Nonnull BuilderSupport support)` |
| `public` | `double` | `getMeleeConeAngle()` |
| `public` | `ActionAttack.BallisticMode` | `getBallisticMode()` |
| `public` | `boolean` | `isCheckLineOfSight()` |
| `public` | `boolean` | `isAvoidFriendlyFire()` |
| `public` | `boolean` | `isDamageFriendlies()` |
| `public` | `boolean` | `isSkipAiming()` |
| `public` | `double` | `getChargeDistance(@Nonnull BuilderSupport support)` |
| `public` | `int` | `getAttackParameterSlot(@Nonnull BuilderSupport support)` |
| `@Nullable public` | `Map<String, String>` | `getInteractionVars()` |
