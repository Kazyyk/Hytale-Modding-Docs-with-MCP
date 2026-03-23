# FileRef

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier.content | Extends: java.lang.Object | Implements: Content

public class FileRef implements Content

A Content implementation that references a file by dot-separated path within the target world-gen root folder.

Also in this package: Content

Complete API:
  public JsonElement get()
  public String toString()
  private String getFilePath()
  private void setFile(String path)

Fields:
public static final String TYPE_ID
public static final BuilderCodec<FileRef> CODEC
protected String path
protected transient JsonObject obj
