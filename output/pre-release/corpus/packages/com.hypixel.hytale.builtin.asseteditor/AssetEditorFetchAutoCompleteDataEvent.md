# AssetEditorFetchAutoCompleteDataEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Implements: IAsyncEvent<String>

public class AssetEditorFetchAutoCompleteDataEvent implements IAsyncEvent<String>

Async event for fetching auto-complete suggestions. The event key is the dataset name (e.g. `"BlockGroups"`, `"LocalizationKeys"`). Handlers populate the `results` array.

## Constructor


public AssetEditorFetchAutoCompleteDataEvent(EditorClient editorClient, String dataSet, String query)

## Methods

- String getQuery() | Returns the search query string
- String getDataSet() | Returns the dataset name
- EditorClient getEditorClient() | Returns the requesting client
- String[] getResults() | Returns the result array
- void setResults(String[]) | Sets the result array
