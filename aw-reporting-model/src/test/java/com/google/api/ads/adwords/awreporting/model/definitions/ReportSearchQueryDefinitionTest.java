// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.awreporting.model.definitions;

import com.google.api.ads.adwords.awreporting.model.entities.ReportSearchQuery;
import com.google.api.ads.adwords.lib.jaxb.v201609.ReportDefinitionReportType;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests the Search Query Performance report definition.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aw-report-sql-beans.xml")
@ActiveProfiles("TEST")
public class ReportSearchQueryDefinitionTest extends
    AbstractReportDefinitionTest<ReportSearchQuery> {

  /**
   * C'tor
   */
  public ReportSearchQueryDefinitionTest() {

    super(ReportSearchQuery.class, ReportDefinitionReportType.SEARCH_QUERY_PERFORMANCE_REPORT,
        "src/test/resources/csv/search-query.csv");
  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   *      AbstractReportDefinitionTest#testFirstEntry(com.google.api.ads.adwords.awreporting.model.entities.Report)
   */
  @Override
  protected void testFirstEntry(ReportSearchQuery first) {

    Assert.assertEquals("text", first.getAdFormat());
    Assert.assertEquals(5254315098L, first.getAdGroupId().longValue());
    Assert.assertEquals("P:CHN:Zhengzhou:420870", first.getAdGroupName());
    Assert.assertEquals("enabled", first.getAdGroupStatus());
    Assert.assertEquals(108654378L, first.getCampaignId().longValue());
    Assert.assertEquals("P:CHN:MY-ms", first.getCampaignName());
    Assert.assertEquals("active", first.getCampaignStatus());
    Assert.assertEquals(25934427378L, first.getCreativeId().longValue());
    Assert.assertEquals(
        "http://ms.hotels.com/PPCHotelDetails?dateless=true&hotelid=420870&pos=HCOM_MY"
        + "&locale=ms_MY&rffrid=sem.hcom.MY.google.003.03.02.{ifsearch:s}{ifcontent:c}"
        + ".kwrd=ZzZz.{ifsearch:s}{ifcontent:c}LT9ZjENe.0.{creative}.10206z418873.d.{device}",
        first.getDestinationUrl());
    Assert.assertEquals(28062339723L, first.getKeywordId().longValue());
    Assert.assertEquals("venus boutique hotel", first.getKeywordTextMatchingQuery());
    Assert.assertEquals("exact", first.getQueryMatchTypeWithVariant());
    Assert.assertEquals("venus boutique hotel", first.getQuery());
    Assert.assertEquals("0.00", first.getConversionValue());
    Assert.assertEquals("Google:CHN:PTX", first.getAccountDescriptiveName());
    Assert.assertEquals("(GMT+08:00) Hong Kong", first.getAccountTimeZoneId());
    Assert.assertEquals("USD", first.getCurrencyCode());
    Assert.assertEquals("2014-03-01", first.getDay());
    Assert.assertEquals(0d, first.getCost().doubleValue());
    Assert.assertEquals(0L, first.getClicks().longValue());
    Assert.assertEquals(1L, first.getImpressions().longValue());
    Assert.assertEquals(0d, first.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(0d, first.getAvgCpm().doubleValue());
    Assert.assertEquals(0d, first.getAvgCpc().doubleValue());
    Assert.assertEquals(7d, first.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("Tablets with full browsers", first.getDevice());
    Assert.assertEquals("Search Network", first.getAdNetwork());

    Assert.assertEquals(0d, first.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(0d, first.getConversionRateBigDecimal().doubleValue());
    Assert.assertEquals(0d, first.getCostPerConversion().doubleValue());
    Assert.assertEquals(0d, first.getValuePerConversionBigDecimal().doubleValue());
    Assert.assertEquals(0d, first.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(0d, first.getConversionRateBigDecimal().doubleValue());

    Assert.assertEquals(0d, first.getCostPerConversion().doubleValue());
    Assert.assertEquals(0d, first.getValuePerConversionBigDecimal().doubleValue());
    Assert.assertEquals(0L, first.getViewThroughConversions().longValue());

  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   *      AbstractReportDefinitionTest#testLastEntry(com.google.api.ads.adwords.awreporting.model.entities.Report)
   */
  @Override
  protected void testLastEntry(ReportSearchQuery last) {

    Assert.assertEquals("text", last.getAdFormat());
    Assert.assertEquals(3833310378L, last.getAdGroupId().longValue());
    Assert.assertEquals("P:CHN:Xi_an:309855", last.getAdGroupName());
    Assert.assertEquals("enabled", last.getAdGroupStatus());
    Assert.assertEquals(80536578L, last.getCampaignId().longValue());
    Assert.assertEquals("P:CHN:CA-en", last.getCampaignName());
    Assert.assertEquals("active", last.getCampaignStatus());
    Assert.assertEquals(25930996578L, last.getCreativeId().longValue());
    Assert.assertEquals(
        "http://www.hotels.com/PPCHotelDetails?dateless=true&pos=HCOM_CA&locale=en_CA&PSRC=G21"
        + "&hotelid=309855&rffrid=sem.hcom.CA.google.003.03.02.{ifsearch:s}{ifcontent:c}"
        + ".kwrd=ZzZz.{ifsearch:s}{ifcontent:c}RKXzhY1Z.0.{creative}.10206z418873.d.{device}",
        last.getDestinationUrl());
    Assert.assertEquals(20178705101L, last.getKeywordId().longValue());
    Assert.assertEquals("titan times hotel xi'an", last.getKeywordTextMatchingQuery());
    Assert.assertEquals("exact (close variant)", last.getQueryMatchTypeWithVariant());
    Assert.assertEquals("titan times hotel xian", last.getQuery());
    Assert.assertEquals("0.00", last.getConversionValue());
    Assert.assertEquals("Google:CHN:PTX", last.getAccountDescriptiveName());
    Assert.assertEquals("(GMT+08:00) Hong Kong", last.getAccountTimeZoneId());
    Assert.assertEquals("USD", last.getCurrencyCode());
    Assert.assertEquals("2014-03-01", last.getDay());
    Assert.assertEquals(0d, last.getCost().doubleValue());
    Assert.assertEquals(0L, last.getClicks().longValue());
    Assert.assertEquals(2L, last.getImpressions().longValue());
    Assert.assertEquals(0d, last.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(0d, last.getAvgCpm().doubleValue());
    Assert.assertEquals(0d, last.getAvgCpc().doubleValue());
    Assert.assertEquals(1d, last.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("Computers", last.getDevice());
    Assert.assertEquals("Search Network", last.getAdNetwork());

    Assert.assertEquals(0d, last.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(0d, last.getConversionRateBigDecimal().doubleValue());
    Assert.assertEquals(0d, last.getCostPerConversion().doubleValue());
    Assert.assertEquals(0d, last.getValuePerConversionBigDecimal().doubleValue());
    Assert.assertEquals(0d, last.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(0d, last.getConversionRateBigDecimal().doubleValue());

    Assert.assertEquals(0d, last.getCostPerConversion().doubleValue());
    Assert.assertEquals(0d, last.getValuePerConversionBigDecimal().doubleValue());
    Assert.assertEquals(0L, last.getViewThroughConversions().longValue());

  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   *      AbstractReportDefinitionTest#retrieveCsvEntries()
   */
  @Override
  protected int retrieveCsvEntries() {

    return 11;
  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   *      AbstractReportDefinitionTest#retrievePropertiesToBeSelected()
   */
  @Override
  protected String[] retrievePropertiesToBeSelected() {

    return new String[] {
        // Report
        "ExternalCustomerId",
        // ReportBase
        "AccountDescriptiveName",
        "AccountTimeZoneId",
        "CustomerDescriptiveName",
        "PrimaryCompanyName",
        "AccountCurrencyCode",
        "Date",
        "DayOfWeek",
        "Week",
        "Month",
        "MonthOfYear",
        "Quarter",
        "Year",
        "Cost",
        "Clicks",
        "Impressions",
        "Ctr",
        "AverageCost",
        "AverageCpm",
        "AverageCpc",
        "AverageCpe",
        "AverageCpv",
        "AveragePosition",
        "Device",
        "ClickType",
        "AdNetworkType1",
        "AdNetworkType2",
        "Engagements",
        "EngagementRate",
        "Interactions",
        "InteractionRate",
        "VideoViews",
        "VideoViewRate",
        "VideoQuartile25Rate",
        "VideoQuartile50Rate",
        "VideoQuartile75Rate",
        "VideoQuartile100Rate",
        "Conversions",
        "ConversionRate",
        "ConversionValue",
        "CostPerConversion",
        "ValuePerConversion",
        "AllConversions",
        "AllConversionRate",
        "AllConversionValue",
        "CostPerAllConversion",
        "ValuePerAllConversion",
        "ConversionCategoryName",
        "ConversionTypeName",
        "ViewThroughConversions",
        // Specific to Search Query Performance Report
        "AdFormat",
        "AdGroupId",
        "AdGroupName",
        "AdGroupStatus",
        "CampaignId",
        "CampaignName",
        "CampaignStatus",
        "CreativeId",
        "DestinationUrl",
        "KeywordId",
        "KeywordTextMatchingQuery",
        "QueryMatchTypeWithVariant",
        "Query",
        "ConversionTrackerId",
        "FinalUrl"
    };
  }
}
