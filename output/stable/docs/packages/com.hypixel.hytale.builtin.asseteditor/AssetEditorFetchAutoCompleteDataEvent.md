---
title: "AssetEditorFetchAutoCompleteDataEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.event"
fqcn: "com.hypixel.hytale.builtin.asseteditor.event.AssetEditorFetchAutoCompleteDataEvent"
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
public class AssetEditorFetchAutoCompleteDataEvent implements IAsyncEvent<String>
```

Async event for fetching auto-complete suggestions. The event key is the dataset name (e.g. `"BlockGroups"`, `"LocalizationKeys"`). Handlers populate the `results` array.

## Constructor

```java
public AssetEditorFetchAutoCompleteDataEvent(EditorClient editorClient, String dataSet, String query)
```

## Methods

| Method | Description |
|---|---|
| `String getQuery()` | Returns the search query string |
| `String getDataSet()` | Returns the dataset name |
| `EditorClient getEditorClient()` | Returns the requesting client |
| `String[] getResults()` | Returns the result array |
| `void setResults(String[])` | Sets the result array |
