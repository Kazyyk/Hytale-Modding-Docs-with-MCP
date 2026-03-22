---
title: "UIEditorFeatures"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIEditorFeatures"
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
public class UIEditorFeatures implements Metadata
```

Schema metadata that enables specific editor features for a property. Sets the `uiEditorFeatures` array on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UIEditorFeatures.EditorFeature[]` | `features` |

## Constructors

```java
public UIEditorFeatures(UIEditorFeatures.EditorFeature... features)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |

## Inner Types

### EditorFeature

```java
public static enum EditorFeature
```

| Constant | Description |
|---|---|
| `WEATHER_DAYTIME_BAR` | Enables a weather/daytime bar in the editor preview. |
| `WEATHER_PREVIEW_LOCAL` | Enables local weather preview in the editor. |
