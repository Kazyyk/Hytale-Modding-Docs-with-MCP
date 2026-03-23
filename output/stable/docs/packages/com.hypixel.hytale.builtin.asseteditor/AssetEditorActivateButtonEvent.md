---
title: "AssetEditorActivateButtonEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorActivateButtonEvent"
api_surface: false
extends: "EditorClientEvent<String>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorActivateButtonEvent extends EditorClientEvent<String>
```

Fired when a button is activated in the editor UI. The event key is the button ID string (e.g. `"EquipItem"`, `"UseModel"`, `"ResetModel"`).

## Constructor

```java
public AssetEditorActivateButtonEvent(EditorClient editorClient, String buttonId)
```

## Methods

| Method | Description |
|---|---|
| `String getButtonId()` | Returns the button identifier |
