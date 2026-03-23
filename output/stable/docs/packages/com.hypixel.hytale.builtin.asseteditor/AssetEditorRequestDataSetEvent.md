---
title: "AssetEditorRequestDataSetEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorRequestDataSetEvent"
api_surface: false
extends: null
implements:
  - "IAsyncEvent<String>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "event"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.event`

```java
public class AssetEditorRequestDataSetEvent implements IAsyncEvent<String>
```

Async event for requesting a full dataset. The event key is the dataset name (e.g. `"ItemCategories"`). Handlers populate the `results` array.

## Constructor

```java
public AssetEditorRequestDataSetEvent(EditorClient editorClient, String dataSet, String[] results)
```

## Methods

| Method | Description |
|---|---|
| `String getDataSet()` | Returns the dataset name |
| `EditorClient getEditorClient()` | Returns the requesting client |
| `String[] getResults()` | Returns the result array |
| `void setResults(String[])` | Sets the result array |
