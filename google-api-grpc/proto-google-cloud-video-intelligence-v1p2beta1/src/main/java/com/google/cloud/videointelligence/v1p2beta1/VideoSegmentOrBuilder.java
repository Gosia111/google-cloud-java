// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

public interface VideoSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.VideoSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  boolean hasStartTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.Duration getStartTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the start of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  boolean hasEndTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.Duration getEndTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the end of the segment (inclusive).
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder();
}