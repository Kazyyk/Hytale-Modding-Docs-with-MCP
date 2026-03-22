---
title: "UITypeIcon"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UITypeIcon"
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
public class UITypeIcon implements Metadata
```

Schema metadata that sets the icon path for a type in the editor UI. Sets `uiTypeIcon` on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `icon` |

## Constructors

```java
public UITypeIcon(String icon)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |
