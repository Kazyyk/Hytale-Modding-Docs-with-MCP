---
title: "WindowManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.WindowManager"
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
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.windows`

```java
public class WindowManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `AtomicInteger` | `windowId` |
| `private final` | `Int2ObjectConcurrentHashMap<Window>` | `windows` |
| `private` | `PlayerRef` | `playerRef` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `init(@Nonnull PlayerRef playerRef)` |
| `@Nullable public` | `UpdateWindow` | `clientOpenWindow(@Nonnull Ref<EntityStore> ref, @Nonnull Window window, @Nonnull Store<EntityStore> store)` |
| `@Nullable public` | `OpenWindow` | `openWindow(@Nonnull Ref<EntityStore> ref, @Nonnull Window window, @Nonnull Store<EntityStore> store)` |
| `@Nullable public` | `List<OpenWindow>` | `openWindows(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Window... windows)` |
| `public` | `void` | `setWindow(int id, @Nonnull Window window)` |
| `private` | `void` | `setWindow0(int id, @Nonnull Window window)` |
| `@Nullable public` | `Window` | `getWindow(int id)` |
| `@Nonnull public` | `List<Window>` | `getWindows()` |
| `public` | `void` | `updateWindow(@Nonnull Window window)` |
| `@Nonnull public` | `Window` | `closeWindow(@Nonnull Ref<EntityStore> ref, int id, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `closeAllWindows(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `markWindowChanged(int id)` |
| `public` | `void` | `updateWindows()` |
| `public` | `void` | `validateWindows(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static <W extends Window>` | `void` | `closeAndRemoveAll(@Nonnull Map<UUID, W> windows)` |
| `@Override @Nonnull public` | `String` | `toString()` |
