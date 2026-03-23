# AssetEditorRequestDataSetEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Implements: IAsyncEvent<String>

public class AssetEditorRequestDataSetEvent implements IAsyncEvent<String>

Async event for requesting a full dataset. The event key is the dataset name (e.g. `"ItemCategories"`). Handlers populate the `results` array.

## Constructor


public AssetEditorRequestDataSetEvent(EditorClient editorClient, String dataSet, String[] results)

## Methods

- String getDataSet() | Returns the dataset name
- EditorClient getEditorClient() | Returns the requesting client
- String[] getResults() | Returns the result array
- void setResults(String[]) | Sets the result array

Also in this package: AssetEditorActivateButtonEvent, AssetEditorAssetCreatedEvent, AssetEditorClientDisconnectEvent, AssetEditorFetchAutoCompleteDataEvent, AssetEditorSelectAssetEvent, AssetEditorUpdateWeatherPreviewLockEvent, EditorClientEvent

Complete API:
  public String getDataSet()
  public EditorClient getEditorClient()
  public String[] getResults()
  public void setResults(String[] results)
  public String toString()

Fields:
private final EditorClient editorClient
private final String dataSet
private String[] results
