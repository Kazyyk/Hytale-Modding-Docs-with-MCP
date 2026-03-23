---
title: "InstanceWorldConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.config"
fqcn: "com.hypixel.hytale.builtin.instances.config.InstanceWorldConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "instances"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.config`

```java
public class InstanceWorldConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `String` | `ID` |
| `@Nonnull public static final` | `BuilderCodec<InstanceWorldConfig>` | `CODEC` |
| `@Nonnull private` | `RemovalCondition[]` | `removalConditions` |
| `@Nullable private` | `WorldReturnPoint` | `returnPoint` |
| `private` | `boolean` | `preventReconnection` |
| `@Nullable private` | `InstanceDiscoveryConfig` | `discovery` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public static` | `InstanceWorldConfig` | `get(@Nonnull WorldConfig config)` |
| `@Nonnull public static` | `InstanceWorldConfig` | `ensureAndGet(@Nonnull WorldConfig config)` |
| `public` | `boolean` | `shouldPreventReconnection()` |
| `@Nonnull public` | `RemovalCondition[]` | `getRemovalConditions()` |
| `public` | `void` | `setRemovalConditions(@Nonnull RemovalCondition... removalConditions)` |
| `@Nullable public` | `WorldReturnPoint` | `getReturnPoint()` |
| `public` | `void` | `setReturnPoint(@Nullable WorldReturnPoint returnPoint)` |
| `@Nullable public` | `InstanceDiscoveryConfig` | `getDiscovery()` |
| `public` | `void` | `setDiscovery(@Nullable InstanceDiscoveryConfig discovery)` |
