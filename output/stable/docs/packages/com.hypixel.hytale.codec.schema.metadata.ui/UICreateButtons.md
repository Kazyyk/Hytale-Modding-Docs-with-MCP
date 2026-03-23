---
title: "UICreateButtons"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UICreateButtons"
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
public class UICreateButtons implements Metadata
```

Schema metadata that configures create buttons for the editor UI. Applies an array of [UIButton](UIButton.md) instances to the schema via `Schema.getHytale().setUiCreateButtons()`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UIButton[]` | `buttons` |

## Constructors

```java
public UICreateButtons(UIButton... buttons)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |
