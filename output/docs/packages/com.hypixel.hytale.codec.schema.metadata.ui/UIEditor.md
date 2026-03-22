---
title: "UIEditor"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIEditor"
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
  - "editor"
  - "api-surface"
---

**Package:** `com.hypixel.hytale.codec.schema.metadata.ui`

```java
public class UIEditor implements Metadata
```

Schema metadata that assigns a custom editor component to a property in the editor UI. Uses a `CodecMapCodec` registry to resolve editor component types by name. Built-in editor components are registered in the `init()` method: `Timeline`, `WeightedTimeline`, `Number`, `Text`, `MultilineText`, `Dropdown`, `Icon`, and `LocalizationKey`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<UIEditor.EditorComponent>` | `CODEC` |
| `public static final` | `UIEditor.Timeline` | `TIMELINE` |
| `public static final` | `UIEditor.WeightedTimeline` | `WEIGHTED_TIMELINE` |
| `private final` | `UIEditor.EditorComponent` | `component` |

## Constructors

```java
public UIEditor(UIEditor.EditorComponent component)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |
| `public static` | `void` | `init()` |

## Inner Types

### EditorComponent

```java
public interface EditorComponent
```

Marker interface for editor component implementations.

### Timeline

```java
public static class Timeline implements UIEditor.EditorComponent
```

Editor component for timeline-style editing.

### WeightedTimeline

```java
public static class WeightedTimeline implements UIEditor.EditorComponent
```

Editor component for weighted timeline editing.

### FormattedNumber

```java
public static class FormattedNumber implements UIEditor.EditorComponent
```

Number editor with configurable step, suffix, and decimal places. Has fluent setters `setStep()`, `setSuffix()`, and `setMaxDecimalPlaces()`.

### TextField

```java
public static class TextField implements UIEditor.EditorComponent
```

Text field editor with an optional `dataSet` reference.

### MultilineTextField

```java
public static class MultilineTextField implements UIEditor.EditorComponent
```

Multiline text editor component.

### Dropdown

```java
public static class Dropdown implements UIEditor.EditorComponent
```

Dropdown selector bound to a `dataSet`.

### Icon

```java
public static class Icon implements UIEditor.EditorComponent
```

Icon editor with `defaultPathTemplate`, `width`, and `height`.

### LocalizationKeyField

```java
public static class LocalizationKeyField implements UIEditor.EditorComponent
```

Localization key editor with `keyTemplate` and optional `generateDefaultKey` flag.
