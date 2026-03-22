---
title: "UIDisplayMode"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIDisplayMode"
api_surface: true
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
  - "api-surface"
---

**Package:** `com.hypixel.hytale.codec.schema.metadata.ui`

```java
public class UIDisplayMode implements Metadata
```

Schema metadata that controls how a property is displayed in the editor UI. Provides three pre-built instances: `NORMAL`, `COMPACT`, and `HIDDEN`. Sets the `uiDisplayMode` property on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `UIDisplayMode` | `NORMAL` |
| `public static final` | `UIDisplayMode` | `COMPACT` |
| `public static final` | `UIDisplayMode` | `HIDDEN` |
| `private final` | `UIDisplayMode.DisplayMode` | `mode` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |

## Inner Types

### DisplayMode

```java
public static enum DisplayMode
```

| Constant | Description |
|---|---|
| `NORMAL` | Standard display mode. |
| `COMPACT` | Reduced-size display. |
| `HIDDEN` | Property is hidden from the editor UI. |
