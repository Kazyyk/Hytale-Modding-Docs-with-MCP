---
title: "ClipboardSnapshot"
kind: "interface"
package: "com.hypixel.hytale.builtin.buildertools.snapshot"
fqcn: "com.hypixel.hytale.builtin.buildertools.snapshot.ClipboardSnapshot"
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
public interface ClipboardSnapshot<T extends SelectionSnapshot<?>> extends SelectionSnapshot<T>
```

Interface defining: `restoreClipboard()`, `AssertionError()`, `getState()`, `restoreClipboard()`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `restoreClipboard(Ref<EntityStore> var1, Player var2, World var3, BuilderToolsPlugin.BuilderState var4, ComponentAccessor<EntityStore> var5)` | `T` | package-private method. |
| `restore(Ref<EntityStore> ref, @Nonnull Player player, World world, ComponentAccessor<EntityStore> componentAccessor)` | `T` | package-private method. |
