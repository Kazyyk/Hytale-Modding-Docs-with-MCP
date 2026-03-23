---
title: "UIDefaultCollapsedState"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIDefaultCollapsedState"
api_surface: false
extends: null
implements:
  - "Metadata"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "metadata"
  - "ui"
---

**Package:** `com.hypixel.hytale.codec.schema.metadata.ui`

```java
public class UIDefaultCollapsedState implements Metadata
```

Schema metadata that controls the default collapsed state of a UI section in the editor. Sets the `uiCollapsedByDefault` property on the schema's Hytale section.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `UIDefaultCollapsedState` | `UNCOLLAPSED` |
| `private final` | `boolean` | `collapsedByDefault` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |
