---
title: "EntitySnapshot"
kind: "interface"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.EntitySnapshot"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "builder-tools"
  - "snapshot"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.snapshot`

```java
public interface EntitySnapshot<T extends SelectionSnapshot<?>> extends SelectionSnapshot<T>
```

Interface defining: `restoreEntity()`, `getStore()`, `restoreEntity()`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `restoreEntity(@Nonnull Player var1, @Nonnull World var2, @Nonnull ComponentAccessor<EntityStore> var3)` | `T` | package-private method. |
| `restore(Ref<EntityStore> ref, Player player, @Nonnull World world, ComponentAccessor<EntityStore> componentAccessor)` | `T` | package-private method. |
