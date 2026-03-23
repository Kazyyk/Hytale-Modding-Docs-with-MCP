---
title: "UIButton"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIButton"
api_surface: true
extends: null
implements: []
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
public class UIButton
```

Represents a UI button definition used by the codec schema metadata system. Contains a text ID (for localization) and a button ID (for event binding). Serialized via `BuilderCodec` with keys `"textId"` and `"buttonId"`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<UIButton>` | `CODEC` |
| `private` | `String` | `buttonId` |
| `private` | `String` | `textId` |

## Constructors

```java
public UIButton(String textId, String buttonId)
```

```java
protected UIButton()
```

## Related Types

- [UICreateButtons](UICreateButtons.md) -- uses `UIButton` arrays to configure create buttons
- [UISidebarButtons](UISidebarButtons.md) -- uses `UIButton` arrays to configure sidebar buttons
