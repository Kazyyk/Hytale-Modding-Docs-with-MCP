# AssetEditorFetchAutoCompleteDataEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Implements: IAsyncEvent

public class AssetEditorFetchAutoCompleteDataEvent implements IAsyncEvent

## Fields

- private final EditorClient editorClient
- private final String dataSet
- private final String query
- private String[] results

## Methods

- public String getQuery()
- public String getDataSet()
- public EditorClient getEditorClient()
- public String[] getResults()
- public void setResults(String[] results)
- @Nonnull @Override public String toString()
