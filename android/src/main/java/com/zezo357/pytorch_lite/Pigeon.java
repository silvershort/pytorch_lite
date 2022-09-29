// Autogenerated from Pigeon (v4.2.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.zezo357.pytorch_lite;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Pigeon {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PyTorchRect {
    private @NonNull Double left;
    public @NonNull Double getLeft() { return left; }
    public void setLeft(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"left\" is null.");
      }
      this.left = setterArg;
    }

    private @NonNull Double top;
    public @NonNull Double getTop() { return top; }
    public void setTop(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"top\" is null.");
      }
      this.top = setterArg;
    }

    private @NonNull Double right;
    public @NonNull Double getRight() { return right; }
    public void setRight(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"right\" is null.");
      }
      this.right = setterArg;
    }

    private @NonNull Double bottom;
    public @NonNull Double getBottom() { return bottom; }
    public void setBottom(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"bottom\" is null.");
      }
      this.bottom = setterArg;
    }

    private @NonNull Double width;
    public @NonNull Double getWidth() { return width; }
    public void setWidth(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"width\" is null.");
      }
      this.width = setterArg;
    }

    private @NonNull Double height;
    public @NonNull Double getHeight() { return height; }
    public void setHeight(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"height\" is null.");
      }
      this.height = setterArg;
    }

    /**Constructor is private to enforce null safety; use Builder. */
    private PyTorchRect() {}
    public static final class Builder {
      private @Nullable Double left;
      public @NonNull Builder setLeft(@NonNull Double setterArg) {
        this.left = setterArg;
        return this;
      }
      private @Nullable Double top;
      public @NonNull Builder setTop(@NonNull Double setterArg) {
        this.top = setterArg;
        return this;
      }
      private @Nullable Double right;
      public @NonNull Builder setRight(@NonNull Double setterArg) {
        this.right = setterArg;
        return this;
      }
      private @Nullable Double bottom;
      public @NonNull Builder setBottom(@NonNull Double setterArg) {
        this.bottom = setterArg;
        return this;
      }
      private @Nullable Double width;
      public @NonNull Builder setWidth(@NonNull Double setterArg) {
        this.width = setterArg;
        return this;
      }
      private @Nullable Double height;
      public @NonNull Builder setHeight(@NonNull Double setterArg) {
        this.height = setterArg;
        return this;
      }
      public @NonNull PyTorchRect build() {
        PyTorchRect pigeonReturn = new PyTorchRect();
        pigeonReturn.setLeft(left);
        pigeonReturn.setTop(top);
        pigeonReturn.setRight(right);
        pigeonReturn.setBottom(bottom);
        pigeonReturn.setWidth(width);
        pigeonReturn.setHeight(height);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("left", left);
      toMapResult.put("top", top);
      toMapResult.put("right", right);
      toMapResult.put("bottom", bottom);
      toMapResult.put("width", width);
      toMapResult.put("height", height);
      return toMapResult;
    }
    static @NonNull PyTorchRect fromMap(@NonNull Map<String, Object> map) {
      PyTorchRect pigeonResult = new PyTorchRect();
      Object left = map.get("left");
      pigeonResult.setLeft((Double)left);
      Object top = map.get("top");
      pigeonResult.setTop((Double)top);
      Object right = map.get("right");
      pigeonResult.setRight((Double)right);
      Object bottom = map.get("bottom");
      pigeonResult.setBottom((Double)bottom);
      Object width = map.get("width");
      pigeonResult.setWidth((Double)width);
      Object height = map.get("height");
      pigeonResult.setHeight((Double)height);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class ResultObjectDetection {
    private @NonNull Long classIndex;
    public @NonNull Long getClassIndex() { return classIndex; }
    public void setClassIndex(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"classIndex\" is null.");
      }
      this.classIndex = setterArg;
    }

    private @Nullable String className;
    public @Nullable String getClassName() { return className; }
    public void setClassName(@Nullable String setterArg) {
      this.className = setterArg;
    }

    private @NonNull Double score;
    public @NonNull Double getScore() { return score; }
    public void setScore(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"score\" is null.");
      }
      this.score = setterArg;
    }

    private @NonNull PyTorchRect rect;
    public @NonNull PyTorchRect getRect() { return rect; }
    public void setRect(@NonNull PyTorchRect setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"rect\" is null.");
      }
      this.rect = setterArg;
    }

    /**Constructor is private to enforce null safety; use Builder. */
    private ResultObjectDetection() {}
    public static final class Builder {
      private @Nullable Long classIndex;
      public @NonNull Builder setClassIndex(@NonNull Long setterArg) {
        this.classIndex = setterArg;
        return this;
      }
      private @Nullable String className;
      public @NonNull Builder setClassName(@Nullable String setterArg) {
        this.className = setterArg;
        return this;
      }
      private @Nullable Double score;
      public @NonNull Builder setScore(@NonNull Double setterArg) {
        this.score = setterArg;
        return this;
      }
      private @Nullable PyTorchRect rect;
      public @NonNull Builder setRect(@NonNull PyTorchRect setterArg) {
        this.rect = setterArg;
        return this;
      }
      public @NonNull ResultObjectDetection build() {
        ResultObjectDetection pigeonReturn = new ResultObjectDetection();
        pigeonReturn.setClassIndex(classIndex);
        pigeonReturn.setClassName(className);
        pigeonReturn.setScore(score);
        pigeonReturn.setRect(rect);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("classIndex", classIndex);
      toMapResult.put("className", className);
      toMapResult.put("score", score);
      toMapResult.put("rect", (rect == null) ? null : rect.toMap());
      return toMapResult;
    }
    static @NonNull ResultObjectDetection fromMap(@NonNull Map<String, Object> map) {
      ResultObjectDetection pigeonResult = new ResultObjectDetection();
      Object classIndex = map.get("classIndex");
      pigeonResult.setClassIndex((classIndex == null) ? null : ((classIndex instanceof Integer) ? (Integer)classIndex : (Long)classIndex));
      Object className = map.get("className");
      pigeonResult.setClassName((String)className);
      Object score = map.get("score");
      pigeonResult.setScore((Double)score);
      Object rect = map.get("rect");
      pigeonResult.setRect((rect == null) ? null : PyTorchRect.fromMap((Map)rect));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class ModelApiCodec extends StandardMessageCodec {
    public static final ModelApiCodec INSTANCE = new ModelApiCodec();
    private ModelApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return PyTorchRect.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return ResultObjectDetection.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value)     {
      if (value instanceof PyTorchRect) {
        stream.write(128);
        writeValue(stream, ((PyTorchRect) value).toMap());
      } else 
      if (value instanceof ResultObjectDetection) {
        stream.write(129);
        writeValue(stream, ((ResultObjectDetection) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface ModelApi {
    @NonNull Long loadModel(@NonNull String modelPath, @Nullable Long numberOfClasses, @Nullable Long imageWidth, @Nullable Long imageHeight);
    /**predicts abstract number input */
    void getPredictionCustom(@NonNull Long index, @NonNull List<Double> input, @NonNull List<Long> shape, @NonNull String dtype, Result<List<Object>> result);
    /**predicts image but returns the raw net output */
    void getImagePredictionList(@NonNull Long index, @Nullable byte[] imageData, @Nullable List<byte[]> imageBytesList, @Nullable Long imageWidthForBytesList, @Nullable Long imageHeightForBytesList, @NonNull List<Double> mean, @NonNull List<Double> std, Result<List<Double>> result);
    /**predicts image but returns the output detections */
    void getImagePredictionListObjectDetection(@NonNull Long index, @Nullable byte[] imageData, @Nullable List<byte[]> imageBytesList, @Nullable Long imageWidthForBytesList, @Nullable Long imageHeightForBytesList, @NonNull Double minimumScore, @NonNull Double IOUThreshold, @NonNull Long boxesLimit, Result<List<ResultObjectDetection>> result);

    /** The codec used by ModelApi. */
    static MessageCodec<Object> getCodec() {
      return ModelApiCodec.INSTANCE;
    }

    /**Sets up an instance of `ModelApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, ModelApi api) {
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ModelApi.loadModel", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String modelPathArg = (String)args.get(0);
              if (modelPathArg == null) {
                throw new NullPointerException("modelPathArg unexpectedly null.");
              }
              Number numberOfClassesArg = (Number)args.get(1);
              Number imageWidthArg = (Number)args.get(2);
              Number imageHeightArg = (Number)args.get(3);
              Long output = api.loadModel(modelPathArg, (numberOfClassesArg == null) ? null : numberOfClassesArg.longValue(), (imageWidthArg == null) ? null : imageWidthArg.longValue(), (imageHeightArg == null) ? null : imageHeightArg.longValue());
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ModelApi.getPredictionCustom", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number indexArg = (Number)args.get(0);
              if (indexArg == null) {
                throw new NullPointerException("indexArg unexpectedly null.");
              }
              List<Double> inputArg = (List<Double>)args.get(1);
              if (inputArg == null) {
                throw new NullPointerException("inputArg unexpectedly null.");
              }
              List<Long> shapeArg = (List<Long>)args.get(2);
              if (shapeArg == null) {
                throw new NullPointerException("shapeArg unexpectedly null.");
              }
              String dtypeArg = (String)args.get(3);
              if (dtypeArg == null) {
                throw new NullPointerException("dtypeArg unexpectedly null.");
              }
              Result<List<Object>> resultCallback = new Result<List<Object>>() {
                public void success(List<Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getPredictionCustom((indexArg == null) ? null : indexArg.longValue(), inputArg, shapeArg, dtypeArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ModelApi.getImagePredictionList", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number indexArg = (Number)args.get(0);
              if (indexArg == null) {
                throw new NullPointerException("indexArg unexpectedly null.");
              }
              byte[] imageDataArg = (byte[])args.get(1);
              List<byte[]> imageBytesListArg = (List<byte[]>)args.get(2);
              Number imageWidthForBytesListArg = (Number)args.get(3);
              Number imageHeightForBytesListArg = (Number)args.get(4);
              List<Double> meanArg = (List<Double>)args.get(5);
              if (meanArg == null) {
                throw new NullPointerException("meanArg unexpectedly null.");
              }
              List<Double> stdArg = (List<Double>)args.get(6);
              if (stdArg == null) {
                throw new NullPointerException("stdArg unexpectedly null.");
              }
              Result<List<Double>> resultCallback = new Result<List<Double>>() {
                public void success(List<Double> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getImagePredictionList((indexArg == null) ? null : indexArg.longValue(), imageDataArg, imageBytesListArg, (imageWidthForBytesListArg == null) ? null : imageWidthForBytesListArg.longValue(), (imageHeightForBytesListArg == null) ? null : imageHeightForBytesListArg.longValue(), meanArg, stdArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.ModelApi.getImagePredictionListObjectDetection", getCodec(), taskQueue);
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Number indexArg = (Number)args.get(0);
              if (indexArg == null) {
                throw new NullPointerException("indexArg unexpectedly null.");
              }
              byte[] imageDataArg = (byte[])args.get(1);
              List<byte[]> imageBytesListArg = (List<byte[]>)args.get(2);
              Number imageWidthForBytesListArg = (Number)args.get(3);
              Number imageHeightForBytesListArg = (Number)args.get(4);
              Double minimumScoreArg = (Double)args.get(5);
              if (minimumScoreArg == null) {
                throw new NullPointerException("minimumScoreArg unexpectedly null.");
              }
              Double IOUThresholdArg = (Double)args.get(6);
              if (IOUThresholdArg == null) {
                throw new NullPointerException("IOUThresholdArg unexpectedly null.");
              }
              Number boxesLimitArg = (Number)args.get(7);
              if (boxesLimitArg == null) {
                throw new NullPointerException("boxesLimitArg unexpectedly null.");
              }
              Result<List<ResultObjectDetection>> resultCallback = new Result<List<ResultObjectDetection>>() {
                public void success(List<ResultObjectDetection> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getImagePredictionListObjectDetection((indexArg == null) ? null : indexArg.longValue(), imageDataArg, imageBytesListArg, (imageWidthForBytesListArg == null) ? null : imageWidthForBytesListArg.longValue(), (imageHeightForBytesListArg == null) ? null : imageHeightForBytesListArg.longValue(), minimumScoreArg, IOUThresholdArg, (boxesLimitArg == null) ? null : boxesLimitArg.longValue(), resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  @NonNull private static Map<String, Object> wrapError(@NonNull Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}