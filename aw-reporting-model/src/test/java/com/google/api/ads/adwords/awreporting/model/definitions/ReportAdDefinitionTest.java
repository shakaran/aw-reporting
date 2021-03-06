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

import com.google.api.ads.adwords.awreporting.model.entities.ReportAd;
import com.google.api.ads.adwords.lib.jaxb.v201609.ReportDefinitionReportType;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests the Ad Performance report definition.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aw-report-sql-beans.xml")
@ActiveProfiles("TEST")
public class ReportAdDefinitionTest extends AbstractReportDefinitionTest<ReportAd> {

  /**
   * C'tor
   */
  public ReportAdDefinitionTest() {
    super(ReportAd.class, ReportDefinitionReportType.AD_PERFORMANCE_REPORT,
        "src/test/resources/csv/ad.csv");
  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   * AbstractReportDefinitionTest#testFirstEntry
   * (com.google.api.ads.adwords.awreporting.model.entities.Report)
   */
  @Override
  protected void testFirstEntry(ReportAd first) {

    Assert.assertEquals(1001270004L, first.getAccountId().longValue());
    Assert.assertEquals("2013-05-01", first.getDay());
    Assert.assertEquals(9.39, first.getCost().doubleValue());
    Assert.assertEquals(32L, first.getClicks().longValue());
    Assert.assertEquals(1258L, first.getImpressions().longValue());
    Assert.assertEquals(0.00, first.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(2.54, first.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(7.46, first.getAvgCpm().doubleValue());
    Assert.assertEquals(0.29, first.getAvgCpc().doubleValue());
    Assert.assertEquals(2.12, first.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", first.getCurrencyCode());

    Assert.assertEquals(132958027L, first.getCampaignId().longValue());
    Assert.assertEquals(6113972227L, first.getAdGroupId().longValue());
    Assert.assertEquals(20549800987L, first.getAdId().longValue());
    Assert.assertEquals("enabled", first.getAdState());
    Assert.assertEquals("approved", first.getCreativeApprovalStatus());
    Assert.assertEquals("CICAgICQ_qa2YBDIARjIASgBMggjtZBfNj2xLw", first.getImageAdUrl());

  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   * AbstractReportDefinitionTest#testLastEntry(
   * com.google.api.ads.adwords.awreporting.model.entities.Report)
   */
  @Override
  protected void testLastEntry(ReportAd last) {

    Assert.assertEquals(1001270004L, last.getAccountId().longValue());
    Assert.assertEquals("2013-05-10", last.getDay());
    Assert.assertEquals(1.46, last.getCost().doubleValue());
    Assert.assertEquals(2L, last.getClicks().longValue());
    Assert.assertEquals(58L, last.getImpressions().longValue());
    Assert.assertEquals(0.00, last.getConversionsBigDecimal().doubleValue());
    Assert.assertEquals(3.45, last.getCtrBigDecimal().doubleValue());
    Assert.assertEquals(25.17, last.getAvgCpm().doubleValue());
    Assert.assertEquals(0.73, last.getAvgCpc().doubleValue());
    Assert.assertEquals(3.29, last.getAvgPositionBigDecimal().doubleValue());
    Assert.assertEquals("EUR", last.getCurrencyCode());

    Assert.assertEquals(132958027L, last.getCampaignId().longValue());
    Assert.assertEquals(6114146707L, last.getAdGroupId().longValue());
    Assert.assertEquals(20551837747L, last.getAdId().longValue());
    Assert.assertEquals("enabled", last.getAdState());
    Assert.assertEquals("approved", last.getCreativeApprovalStatus());
    Assert.assertEquals("CICAgICQ_qb-SBDUAxg8KAEyCKaVuANwDCr0", last.getImageAdUrl());

  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   * AbstractReportDefinitionTest#retrieveCsvEntries()
   */
  @Override
  protected int retrieveCsvEntries() {
    return 20;
  }

  /**
   * @see com.google.api.ads.adwords.awreporting.model.definitions.
   * AbstractReportDefinitionTest#retrievePropertiesToBeSelected()
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
        // Specific to Ad Performance
        "CampaignId",
        "AdGroupId",
        "Id",
        "Status",
        "DisplayUrl",
        "CreativeDestinationUrl",
        "ImageAdUrl",
        "Headline",
        "Description1",
        "Description2",
        "HeadlinePart1",
        "HeadlinePart2",
        "Description",
        "Path1",
        "Path2",
        "BusinessName",
        "LongHeadline",
        "ShortHeadline",
        "CreativeApprovalStatus",
        "AdGroupAdDisapprovalReasons",
        "AdGroupAdTrademarkDisapproved",
        "Labels",
        "CampaignName",
        "AdGroupName",
        "AdType",
        "ActiveViewCpm",
        "ActiveViewCtr",
        "ActiveViewImpressions",
        "ActiveViewMeasurability",
        "ActiveViewMeasurableCost",
        "ActiveViewMeasurableImpressions",
        "ActiveViewViewability",
        "ConversionTrackerId",
        "CreativeFinalAppUrls",
        "CreativeFinalMobileUrls",
        "CreativeFinalUrls",
        "CreativeTrackingUrlTemplate",
        "CreativeUrlCustomParameters",
        "CriterionId",
        "Trademarks",
        // Analytics Fieds        
        "AveragePageviews",
        "AverageTimeOnSite",
        "BounceRate",
        "PercentNewVisitors",
        "GmailForwards",
        "GmailSaves",
        "GmailSecondaryClicks",
        "Slot"
    };
  }
}
