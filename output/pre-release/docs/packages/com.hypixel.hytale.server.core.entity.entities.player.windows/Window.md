---
title: "Window"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.Window"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "windows"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.windows`

```java
public abstract class Window
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `WindowType` | `windowType` |
| `protected final` | `AtomicBoolean` | `isDirty` |
| `protected final` | `AtomicBoolean` | `needRebuild` |
| `private` | `int` | `id` |
| `private` | `WindowManager` | `manager` |
| `private` | `PlayerRef` | `playerRef` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `init(@Nonnull PlayerRef playerRef, @Nonnull WindowManager manager)` |
| `@Nonnull public abstract` | `JsonObject` | `getData()` |
| `protected` | `boolean` | `onOpen(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
| `protected abstract` | `boolean` | `onOpen0(@Nonnull Ref<EntityStore> var1, @Nonnull Store<EntityStore> var2)` |
| `protected` | `void` | `onClose(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `protected abstract` | `void` | `onClose0(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)` |
| `public` | `void` | `handleAction(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WindowAction action)` |
| `@Nonnull public` | `WindowType` | `getType()` |
| `public` | `void` | `setId(int id)` |
| `public` | `int` | `getId()` |
| `@Nullable public` | `PlayerRef` | `getPlayerRef()` |
| `public` | `void` | `close(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `protected` | `void` | `invalidate()` |
| `protected` | `void` | `setNeedRebuild()` |
| `protected` | `boolean` | `consumeIsDirty()` |
| `protected` | `void` | `consumeNeedRebuild()` |
| `@Nonnull public` | `EventRegistration` | `registerCloseEvent(@Nonnull Consumer<Window.WindowCloseEvent> consumer)` |
| `@Nonnull public` | `EventRegistration` | `registerCloseEvent(short priority, @Nonnull Consumer<Window.WindowCloseEvent> consumer)` |
| `@Nonnull public` | `EventRegistration` | `registerCloseEvent(@Nonnull EventPriority priority, @Nonnull Consumer<Window.WindowCloseEvent> consumer)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |

## Inner Types

- `Window.WindowCloseEvent`
