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

Also in this package: AssetEditorActivateButtonEvent, AssetEditorAssetCreatedEvent, AssetEditorClientDisconnectEvent, AssetEditorRequestDataSetEvent, AssetEditorSelectAssetEvent, AssetEditorUpdateWeatherPreviewLockEvent, EditorClientEvent

Complete API:
  public String getQuery()
  public String getDataSet()
  public EditorClient getEditorClient()
  public String[] getResults()
  public void setResults(String[] results)
  public String toString()

Fields:
private final EditorClient editorClient
private final String dataSet
private final String query
private String[] results
