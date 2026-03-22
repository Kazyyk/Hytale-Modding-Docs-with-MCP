---
title: "UIEditorPreview"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIEditorPreview"
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
public class UIEditorPreview implements Metadata
```

Schema metadata that configures the preview type shown in the editor for an asset type. Sets `uiEditorPreview` on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UIEditorPreview.PreviewType` | `previewType` |

## Constructors

```java
public UIEditorPreview(UIEditorPreview.PreviewType type)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |

## Inner Types

### PreviewType

```java
public static enum PreviewType
```

| Constant | Description |
|---|---|
| `ITEM` | Item preview in the editor. |
| `MODEL` | 3D model preview. |
| `REVERB_EFFECT` | Audio reverb effect preview. |
| `EQUALIZER_EFFECT` | Audio equalizer effect preview. |
