---
title: "com.hypixel.hytale.codec.schema.metadata.ui"
kind: "package"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "metadata"
  - "ui"
  - "editor"
---

**Package:** `com.hypixel.hytale.codec.schema.metadata.ui`

UI-related schema metadata classes for the Hytale asset editor. These `Metadata` implementations modify `Schema` objects to control how properties are displayed, edited, and previewed in the client-side editor. Includes display mode control, editor component assignment, cache rebuild declarations, button configuration, and section layout.

## Types

| Type | Kind | Description |
|---|---|---|
| [UIButton](UIButton.md) | class | Button definition with text ID and button ID. |
| [UICreateButtons](UICreateButtons.md) | class | Metadata setting create buttons on a schema. |
| [UIDefaultCollapsedState](UIDefaultCollapsedState.md) | class | Metadata controlling default collapsed state. |
| [UIDisplayMode](UIDisplayMode.md) | class | Metadata controlling property display mode (NORMAL, COMPACT, HIDDEN). |
| [UIEditor](UIEditor.md) | class | Metadata assigning a custom editor component to a property. |
| [UIEditorFeatures](UIEditorFeatures.md) | class | Metadata enabling specific editor features. |
| [UIEditorPreview](UIEditorPreview.md) | class | Metadata configuring the preview type (ITEM, MODEL, etc.). |
| [UIEditorSectionStart](UIEditorSectionStart.md) | class | Metadata marking a new editor section. |
| [UIPropertyTitle](UIPropertyTitle.md) | class | Metadata overriding a property's display title. |
| [UIRebuildCaches](UIRebuildCaches.md) | class | Metadata declaring which client caches to rebuild on edit. |
| [UISidebarButtons](UISidebarButtons.md) | class | Metadata configuring sidebar buttons. |
| [UITypeIcon](UITypeIcon.md) | class | Metadata setting the icon for a type. |
