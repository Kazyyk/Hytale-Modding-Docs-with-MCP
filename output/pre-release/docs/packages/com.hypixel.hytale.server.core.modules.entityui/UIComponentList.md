---
title: "UIComponentList"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entityui"
fqcn: "com.hypixel.hytale.server.core.modules.entityui.UIComponentList"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
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
public class UIComponentList implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String[]` | `components` |
| `protected` | `int[]` | `componentIds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, UIComponentList>` | `getComponentType()` |
| `public` | `void` | `update()` |
| `public` | `int[]` | `getComponentIds()` |
| `@Override @Nonnull public` | `Component<EntityStore>` | `clone()` |
