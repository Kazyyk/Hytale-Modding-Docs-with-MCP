---
title: "EditorClientEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.EditorClientEvent"
api_surface: false
extends: null
implements:
  - "IEvent<KeyType>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public abstract class EditorClientEvent<KeyType> implements IEvent<KeyType>
```

Base event class for all asset editor events that carry an [EditorClient](EditorClient.md) reference. Subclassed by all specific editor events.

## Constructor

```java
public EditorClientEvent(EditorClient editorClient)
```

## Methods

| Method | Description |
|---|---|
| `EditorClient getEditorClient()` | Returns the editor client that triggered this event |
