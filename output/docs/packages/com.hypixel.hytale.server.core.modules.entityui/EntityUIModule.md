---
title: "EntityUIModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entityui"
fqcn: "com.hypixel.hytale.server.core.modules.entityui.EntityUIModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "entityui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entityui`

```java
public class EntityUIModule extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `private static` | `EntityUIModule` | `instance` |
| `private ComponentType<EntityStore,` | `UIComponentList>` | `uiComponentListType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `EntityUIModule` | `get()` |
| `public` | `ComponentType<EntityStore, UIComponentList>` | `getUIComponentListType()` |
| `@Override protected` | `void` | `setup()` |
| `private` | `void` | `onLoadedAssetsEvent(LoadedAssetsEvent<String, EntityUIComponent, IndexedLookupTableAssetMap<String, EntityUIComponent>> event)` |
