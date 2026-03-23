---
title: "InstanceEntityConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.config"
fqcn: "com.hypixel.hytale.builtin.instances.config.InstanceEntityConfig"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
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
public class InstanceEntityConfig implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `String` | `ID` |
| `@Nonnull public static final` | `BuilderCodec<InstanceEntityConfig>` | `CODEC` |
| `private` | `WorldReturnPoint` | `returnPoint` |
| `private transient` | `WorldReturnPoint` | `returnPointOverride` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, InstanceEntityConfig>` | `getComponentType()` |
| `@Nonnull public static` | `InstanceEntityConfig` | `ensureAndGet(@Nonnull Holder<EntityStore> holder)` |
| `@Nullable public static` | `InstanceEntityConfig` | `removeAndGet(@Nonnull Holder<EntityStore> holder)` |
| `public` | `WorldReturnPoint` | `getReturnPoint()` |
| `public` | `void` | `setReturnPoint(WorldReturnPoint returnPoint)` |
| `public` | `WorldReturnPoint` | `getReturnPointOverride()` |
| `public` | `void` | `setReturnPointOverride(WorldReturnPoint returnPointOverride)` |
| `@Nonnull public` | `InstanceEntityConfig` | `clone()` |
