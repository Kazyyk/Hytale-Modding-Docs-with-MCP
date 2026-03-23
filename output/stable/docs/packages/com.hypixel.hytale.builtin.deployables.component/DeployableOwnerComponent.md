---
title: "DeployableOwnerComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.component"
fqcn: "com.hypixel.hytale.builtin.deployables.component.DeployableOwnerComponent"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables.component`

```java
public class DeployableOwnerComponent implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `List<Pair<String, Ref<EntityStore>>>` | `deployables` |
| `@Nonnull private final` | `Object2IntMap<String>` | `deployableCountPerId` |
| `@Nonnull private final` | `List<Ref<EntityStore>>` | `deployablesForDestruction` |
| `@Nonnull private final` | `List<Pair<String, Ref<EntityStore>>>` | `tempDestructionList` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, DeployableOwnerComponent>` | `getComponentType()` |
| `private static` | `int` | `getMaxDeployablesForId(@Nonnull DeployableComponent comp)` |
| `private static` | `int` | `getMaxDeployablesGlobal(@Nonnull Store<EntityStore> store)` |
| `public` | `void` | `tick(@Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `registerDeployable(@Nonnull Ref<EntityStore> owner,
        @Nonnull DeployableComponent deployableComp,
        @Nonnull String id,
        @Nonnull Ref<EntityStore> deployable,
        @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `deRegisterDeployable(@Nonnull String id, @Nonnull Ref<EntityStore> deployable)` |
| `private` | `void` | `incrementId(@Nonnull String id)` |
| `private` | `void` | `decrementId(@Nonnull String id)` |
| `private` | `int` | `getCurrentDeployablesById(@Nonnull String id)` |
| `private` | `void` | `handlePerDeployableLimit(@Nonnull String id, @Nonnull DeployableComponent deployableComponent)` |
| `private` | `void` | `handleGlobalDeployableLimit(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> owner)` |
| `private` | `void` | `handleOverMaxDeployableDestruction(@Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
