---
title: "UIEditorSectionStart"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIEditorSectionStart"
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
public class UIEditorSectionStart implements Metadata
```

Schema metadata that marks the beginning of a new section in the editor UI with a given title. Sets `uiSectionStart` on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `title` |

## Constructors

```java
public UIEditorSectionStart(String title)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |
