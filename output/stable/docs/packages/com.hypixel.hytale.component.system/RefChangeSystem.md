---
title: "RefChangeSystem"
kind: "class"
package: "com.hypixel.hytale.component.system"
fqcn: "com.hypixel.hytale.component.system.RefChangeSystem"
api_surface: true
extends: "Component<ECS_TYPE>> extends System<ECS_TYPE>"
implements: ["QuerySystem<ECS_TYPE>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "component"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class RefChangeSystem<ECS_TYPE, T extends Component<ECS_TYPE>> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public abstract` | `ComponentType<ECS_TYPE, T>` | `componentType()` |
| `public abstract` | `void` | `onComponentAdded(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)` |
| `public abstract` | `void` | `onComponentSet(@Nonnull Ref<ECS_TYPE> var1, @Nullable T var2, @Nonnull T var3, @Nonnull Store<ECS_TYPE> var4, @Nonnull CommandBuffer<ECS_TYPE> var5)` |
| `public abstract` | `void` | `onComponentRemoved(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)` |
